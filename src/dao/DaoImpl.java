package dao;

public class DaoImpl implements IDao{

    @Override
    public Double getData() {
        double data=22;
        System.out.println("acces a la bd");
        return data;
    }
}
