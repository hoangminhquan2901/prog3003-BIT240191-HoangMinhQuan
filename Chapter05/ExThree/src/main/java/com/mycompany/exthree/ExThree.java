/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exthree;

/**
 *
 * @author Admin
 */
import jakarta.persistence.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import java.util.Properties;

@Entity
@Table(name = "products")
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private double price;

    public Product() {}
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
}

public class ExThree {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        
        Properties props = new Properties();
        props.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        props.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/java_exercise");
        props.put("hibernate.connection.username", "root");
        props.put("hibernate.connection.password", "minhquan120605"); 
        props.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        props.put("hibernate.hbm2ddl.auto", "update"); 
        props.put("hibernate.show_sql", "true");      

        config.setProperties(props);
        config.addAnnotatedClass(Product.class);

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(config.getProperties()).build();

        try (SessionFactory factory = config.buildSessionFactory(serviceRegistry);
             Session session = factory.openSession()) {
            
            Product laptop = new Product("Laptop", 1500);

            session.beginTransaction();

            session.persist(laptop);

            session.getTransaction().commit();

            System.out.println("\n------------------------------------");
            System.out.println("Luu thanh cong san pham: " + laptop.getName());
            System.out.println("ID tu dong tao: " + laptop.getId());
            System.out.println("------------------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
