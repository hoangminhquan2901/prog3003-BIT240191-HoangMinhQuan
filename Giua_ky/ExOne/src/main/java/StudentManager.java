/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;

public class StudentManager<T> {
    private List<T> data;
    public StudentManager() {
        this.data = new ArrayList<>();
    }

    public void add(T item) {
        this.data.add(item);
    }

    public List<T> getAll() {
        return this.data;
    }
}


