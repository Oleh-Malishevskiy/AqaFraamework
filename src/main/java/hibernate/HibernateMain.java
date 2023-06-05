package hibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import static hibernate.HibernateUtil.getSessionFactory;


public class HibernateMain  {
    static Session session = getSessionFactory().getCurrentSession();





    public static void printCreatedProject(String log) {
        session.beginTransaction();
        SaveLogs saveLogs = new SaveLogs();
        saveLogs.setLogs(log);
        session.save(saveLogs);
        session.getTransaction().commit();
        session.close();
        System.exit(0);

    }
    public static void printProblemTable() {
        session.beginTransaction();
        Query query1 = session.createQuery("FROM "+ MantisTextBugTable.class.getName());
        List<MantisProjectTable> results = query1.list();
        System.out.println(results);
//        Query query2 = session.createQuery("FROM "+ MantisBugTable.class.getName());
//        List<MantisProjectTable> results2 = query2.list();
//        System.out.println(results2);
        session.getTransaction().commit();
        session.close();
        System.exit(0);

    }

}