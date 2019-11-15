package jv2_session8;

import java.util.ArrayList;

public interface DataAccessObject <S> {

    boolean create();
    int update();
    int delete();
    ArrayList<S> read();
    S find(Integer id);
}
