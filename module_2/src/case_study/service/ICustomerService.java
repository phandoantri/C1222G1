package case_study.service;

public interface ICustomerService extends IService{
    void display();

    @Override
    void add();

    @Override
    void edit();
}
