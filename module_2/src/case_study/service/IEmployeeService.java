package case_study.service;

import case_study.model.Employee;

import java.util.List;

public interface IEmployeeService extends IService{
    @Override
    void display();

    @Override
    void add();

    @Override
    void edit();
}
