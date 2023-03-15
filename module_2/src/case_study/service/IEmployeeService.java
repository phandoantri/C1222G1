package case_study.service;

public interface IEmployeeService extends IService{
    @Override
    void display();

    @Override
    void add();
void edit(String name);
}
