package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    IDao dao=null;


    @Override
    public double calcul() {
        double res= dao.getData()+11;
        return  res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
