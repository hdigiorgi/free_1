package free.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface ValueHolderRepository extends CrudRepository<ValueHolder, String> {
    //Optional<ValueHolder> findByValue(String value);

    //ValueHolder findById(String id);
    ValueHolder findByValue(String value);
    //Optional<ValueHolder> findById(String id);
    //Optional<ValueHolder> findByValue(String value);
}
