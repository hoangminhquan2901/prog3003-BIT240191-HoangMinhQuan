/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
public class StudentManager<T> {
    private ArrayList<T> data = new ArrayList<>();
    public void save(T item) {
        data.add(item);
    }

    public T findById(int id) {
        if (id < data.size()) {
            return data.get(id);
        }
        return null;
    }

}
