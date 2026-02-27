/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exfour;

/**
 *
 * @author Admin
 */
import jakarta.persistence.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;
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

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    
    @Override
    public String toString() {
        return "ID: " + id + " | Ten: " + name + " | Gia: " + price;
    }
}

public class ExFour {
    public static void main(String[] args) {
        Configuration config = new Configuration();
        
        Properties props = new Properties();
        props.put("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
        props.put("hibernate.connection.url", "jdbc:mysql://localhost:3306/java_exercise");
        props.put("hibernate.connection.username", "root");
        props.put("hibernate.connection.password", "minhquan120605");  
        props.put("hibernate.show_sql", "true"); 

        config.setProperties(props);
        config.addAnnotatedClass(Product.class);

        try (SessionFactory factory = config.buildSessionFactory();
             Session session = factory.openSession()) {
            
            session.beginTransaction();

            System.out.println("\n--- DANG TRUY VAN SAN PHAM GIA > 1000 ---");

            String hql = "FROM Product p WHERE p.price > 1000";
            
            List<Product> results = session.createQuery(hql, Product.class).getResultList();

            if (results.isEmpty()) {
                System.out.println("Khong co san pham nao thoa man dieu kien.");
            } else {
                for (Product p : results) {
                    System.out.println(p.toString());
                }
            }

            session.getTransaction().commit();
            System.out.println("------------------------------------------\n");

        } catch (Exception e) {
            System.err.println("Loi ket noi: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
