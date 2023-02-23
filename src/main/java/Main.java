import income.Income;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class Main {

    public static void main(String[] args) {


        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Income.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();



    }

}
