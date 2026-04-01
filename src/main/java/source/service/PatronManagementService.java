package source.service;

import source.entity.Patron;

import java.util.List;

public interface PatronManagementService {

     List<Patron> finAll();

     List<Patron> findAllByActiveFag(int activeFag);

     void save(Patron patron);

     void update(Patron patron);

     Patron findById (long id);
}
