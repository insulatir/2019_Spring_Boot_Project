package repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SUMMERNOR_V4Repository {
    @Autowired
    private MongoTemplate mongoTemplate;

    
}
