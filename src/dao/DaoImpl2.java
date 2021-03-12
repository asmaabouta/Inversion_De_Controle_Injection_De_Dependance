package dao;

public class DaoImpl2 implements IDao{

    @Override
    public Double getData() {

        double data=33;
        System.out.println("acces au WebService");
        return data;
    }
}
