package jv2_session8;

import java.util.ArrayList;

public interface DataAccessObject <S> {

    boolean create(S s);
    int update(S s);
    int delete(S s);
    ArrayList<S> read();
    S find(Integer id);
}
