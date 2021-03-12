package presentation;

import dao.DaoImpl;
import dao.DaoImpl2;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation {
    public static void main(String[] args) {
        System.out.println("main");
        try {


            Scanner scanner = new Scanner(new File("config.txt"));

            String daoname=scanner.nextLine();
            Class daoclass=Class.forName(daoname);
            IDao dao=(IDao) daoclass.newInstance();

            String metierName=scanner.nextLine();
            Class metierClass=Class.forName(metierName);
            IMetier metier = (IMetier) metierClass.newInstance();

            Method m = metierClass.getMethod("setDao", IDao.class );
            m.invoke(metier, dao);

            System.out.println(metier.calcul());

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }










        // DaoImpl dao=new DaoImpl();
       // DaoImpl2 dao2= new DaoImpl2();
      //  MetierImpl m1=new MetierImpl();
        //m1.setDao(dao);
        //m1.setDao(dao2);
       // System.out.println(m1.calcul());
    }
}
