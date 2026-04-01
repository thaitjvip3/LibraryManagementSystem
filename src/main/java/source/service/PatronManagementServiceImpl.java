package source.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import source.DAO.PatronManagementDAO;
import source.entity.Patron;

import java.util.List;

@Service
public class PatronManagementServiceImpl implements PatronManagementService {
    @Autowired
    PatronManagementDAO patronManagementDAO;

    @Override
    public List<Patron> finAll() {
        return patronManagementDAO.findAll();
    }

    @Override
    public List<Patron> findAllByActiveFag(int activeFag) {
        return patronManagementDAO.findByActiveFag(activeFag);
    }

    @Override
    public void save(Patron patron) {
        patronManagementDAO.save(patron);
    }

    @Override
    public void update(Patron patron) {
        patronManagementDAO.save(patron);
    }

    @Override
    public Patron findById(long id) {
        return patronManagementDAO.findById(id);
    }
}