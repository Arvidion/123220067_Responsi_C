/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;
import java.util.List;
import model.*;
/**
 *
 * @author PC PRAKTIKUM
 */
public interface dimplement {
    public void insert(datadb p);
    public void update(datadb p);
    public void delete(String nama);
    public List<datadb> getAll();
}
