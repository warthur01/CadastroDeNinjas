package dev.java10x.CadastrodeNinjas.Missoes;

import dev.java10x.CadastrodeNinjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missions")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String Name;
    private String Difficulty;
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getDifficulty() {
        return Difficulty;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDifficulty(String difficulty) {
        Difficulty = difficulty;
    }
}
