package source.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import source.DAO.PatronTypeDAO;
import source.entity.PatronTypes;

import java.util.List;

@Service
public class PatronTypeServiceImpl implements PatronTypeService {

    @Autowired
    PatronTypeDAO patronTypeDAO;

    @Override
    public List<PatronTypes> findAllByActiveFag(int activeFag) {
        return patronTypeDAO.findByActiveFag(activeFag);
    }

    @Override
    public PatronTypes findByName(String name) {
        return patronTypeDAO.findByName(name);
    }

    @Override
    public PatronTypes findById(long id) {
        return patronTypeDAO.findById1(id);
    }
}
