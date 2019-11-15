package jv2_session8;

import Connector.Connector;
import jv2_labs6.Contact;

import java.sql.ResultSet;
import java.util.ArrayList;

public class DataAccessObjectContact implements DataAccessObject<Contact> {

    @Override
    public boolean create(Contact contact) {
        Connector connector = Connector.get_instance();
        String sql = "INSERT INTO "+contact.tableName+" (contact_name,company,address)"+
                " VALUES('"+contact.getContact_name()+"','"+contact.getCompany()+"','"+
                contact.getAddress()+"')";
        return connector.updateQuery(sql);
    }

    @Override
    public int update(Contact contact) {
        Connector connector = Connector.get_instance();
        String sql = "UPDATE "+ contact.tableName+" SET contact_name="+contact.getContact_name()+
                " company="+contact.getCompany()+" address="+contact.getAddress()+
                " WHERE id="+contact.getId();

        return connector.updateQuery(sql)?1:0;
    }

    @Override
    public int delete(Contact contact) {
        Connector connector = Connector.get_instance();
        String sql = "DELETE FROM "+contact.tableName+" WHERE id="+contact.getId();
        return connector.updateQuery(sql)?1:0;
    }

    @Override
    public ArrayList<Contact> read() {
        Contact contact = new Contact();
        Connector connector = Connector.get_instance();
        String sql = "SELECT * FROM "+contact.tableName;
        ResultSet rs = connector.getQuery(sql);
        try {
            ArrayList<Contact> list = new ArrayList<>();
            while (rs.next()){
                list.add(new Contact(rs.getInt("id"),rs.getString("contact_name"),
                        rs.getString("company"),rs.getString("address")));
            }
            return list;
        }catch (Exception e){}
        return null;
    }

    @Override
    public Contact find(Integer id) {
        Contact contact = new Contact();
        Connector connector = Connector.get_instance();
        String sql = "SELECT * FROM "+contact.tableName+" WHERE id="+id;
        ResultSet rs = connector.getQuery(sql);
        try {
            while (rs.next()){
                contact.setId(rs.getInt("id"));
                contact.setContact_name(rs.getString("contact_name"));
                contact.setCompany(rs.getString("company"));
                contact.setAddress(rs.getString("address"));
            }
        }catch (Exception e){}
        return contact;
    }
}