package HW19;

public class AdditionalMaterials {
    String AddMat;

    public AdditionalMaterials(String addMat) {
        AddMat = addMat;
    }



    public String getAddMat() {
        return AddMat;
    }

    public void setAddMat(String addMat) {
        AddMat = addMat;
    }

    @Override
    public String toString() {
        return "AdditionalMaterials{" +
                "AddMat='" + AddMat + '\'' +
                '}';
    }
}
