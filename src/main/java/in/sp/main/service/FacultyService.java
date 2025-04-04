package in.sp.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.dao.CaDao;
import in.sp.main.model.Ca;

@Service
public class FacultyService {

    @Autowired
    private CaDao caDao;
    public Ca addCa(Ca ca) {
       return caDao.save(ca);
    }
}
