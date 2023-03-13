package HW17;

public class AdditionalMaterials {

    private int id;
    private String name;
    private int lectureId;
    private ResourceType ResourceType;

    public AdditionalMaterials() {
    }

    public AdditionalMaterials(int id, String name, int lectureId, HW17.ResourceType resourceType) {
        this.id = id;
        this.name = name;
        this.lectureId = lectureId;
        resourceType = resourceType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public HW17.ResourceType getResourceType() {
        return ResourceType;
    }

    public void setResourceType(HW17.ResourceType resourceType) {
        resourceType = resourceType;
    }

    @Override
    public String toString() {
        return "AdditionalMaterials{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lectureId=" + lectureId +
                ", ResourceType=" + ResourceType +
                '}';
    }
}
