/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyproject.service;

import easyproject.collection.User;
import easyproject.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private Mail mail;
    

    public UserRepository getRepository() {
        return repository;
    }

    public User findByEmail(String email) {
//        Query a = new Query();
//        a.addCriteria(Criteria.where("email").is(email));
//        ApplicationContext ac = new GenericXmlApplicationContext("SpringConfig.xml");
//        MongoOperations mongoO = (MongoOperations) ac.getBean("mongoTemplate");
//
//        User u = mongoO.findOne(a, User.class);
//        return u;
        return repository.findUsersByEmail(email);
    }
    
    
    public List<User> findUsersByName(String name){
        return repository.findUsersByName(name);
    }

    public void createUser(User u) {
        repository.save(u);
    }
    
    public List<User> findAllUsers() {
        return repository.findAll();
    }
    
    public void deleteUser (User u) {
        repository.delete(u);
    }
    
    public void editUser (User u) {
        repository.save(u);
    }
    
    public User findUsersById(String id) {
        User user = repository.findOne(id);
        return user;
    }
    
    public User findUsersByEmail(String email) {
        User user = repository.findUsersByEmail(email);
        return user;
    }
    
    public void sendEmail(String user,String email,String desteny, String subject, String message){
        
        String message1 = "El usuario " + user + ", con email " + email + ", le ha mandado el siguiente mensaje: \n\n" + message;
        
        mail = new Mail(subject, message1,desteny);
        mail.sendMail();
    }
    
    public void sendEmailCreate(String desteny, String subject, String message){
        mail=new Mail(subject,message,desteny);
        mail.sendMail();
    }
}
