package jv2_session8;

import jv2_labs6.Contact;

import java.util.ArrayList;

public class DataObjectContact implements DataAccessObject<Contact> {

    @Override
    public boolean create() {
        return false;
    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public int delete() {
        return 0;
    }

    @Override
    public ArrayList<Contact> read() {
        return null;
    }

    @Override
    public Contact find(Integer id) {
        return null;
    }
}
