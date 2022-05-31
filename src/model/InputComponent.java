package model;

import dao.IValidation;

public class InputComponent {
    private IValidation iValidation;
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public void setiValidation(IValidation iValidation) {
        this.iValidation = iValidation;
    }

    public void display() {

    }

    public boolean validate() {
        return true;
    }
}
