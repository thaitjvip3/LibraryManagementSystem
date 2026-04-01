package source.service;

import source.entity.PatronTypes;

import java.util.List;

public interface PatronTypeService {

    List<PatronTypes> findAllByActiveFag(int activeFag);

    PatronTypes findByName (String name);


    PatronTypes findById(long id);
}
