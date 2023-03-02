package ss12_ArrayList.service;

import ss12_ArrayList.repository.ProductRepository;

public class ProductService implements IProductService{
    private ProductRepository productRepository=new ProductRepository();
    @Override
    public void hienThi() {
        productRepository.hienThi();
    }

    @Override
    public void xoa(String id) {
        productRepository.xoa(id);
    }

    @Override
    public void search(String product) {
        productRepository.search(product);
    }

    @Override
    public void addProduct() {
        productRepository.addProduct();
    }


}
