package listeners;

import hibernate.HibernateMain;
import org.apache.log4j.Logger;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import static hibernate.HibernateMain.printCreatedProject;

public class CustomSuiteListener implements ISuiteListener {
    private final Logger LOGGER = Logger.getLogger(this.getClass());
    @Override
    public void onStart(ISuite suite) {
        ISuiteListener.super.onStart(suite);
        LOGGER.info(suite.getName()+" START");
    }

    @Override
    public void onFinish(ISuite suite) {
//        printCreatedProject(LOGGER.getName().toString());
        ISuiteListener.super.onFinish(suite);
        LOGGER.info(suite.getName()+" FINISH");
    }
}
