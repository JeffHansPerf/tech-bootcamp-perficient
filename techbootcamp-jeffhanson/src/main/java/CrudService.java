import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudService {

    private final CrudRepository crudRepository;

    public CrudService(CrudRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    public List<Company> getCompanyList() {
        return crudRepository.findAll();
    }

    public Company getCompanyById(Integer id) {
        return crudRepository.findById(id).get();
    }

    public void saveOrUpdateCompany(Company company) {
        crudRepository.save(company);
    }

    public void deleteCompany(Integer id) {
        crudRepository.deleteById(id);
    }

}
