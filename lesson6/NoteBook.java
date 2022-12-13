package lesson6;

import java.util.List;

public class NoteBook {
    private String brand;
    private String model;
    private String size;
    private List<String> operativeMemory;
    private List<String> hardDisk;
    private String system;
    private String color;

    public NoteBook(String brand, String model, String size, List<String> operativeMemory, List<String> hardDisk, String system, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.operativeMemory = operativeMemory;
        this.hardDisk = hardDisk;
        this.system = system;
        this.color = color;
    }


}

