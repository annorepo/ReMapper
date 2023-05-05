package org.remapper.dto;

import java.util.Objects;

public class EntityInfo {

    private String container;
    private EntityType type;
    private String name;
    private String signature;
    // resolve the issue of the same class name in multiple modules in the project
    private String filePath;
    private LocationInfo location;

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public EntityType getType() {
        return type;
    }

    public void setType(EntityType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSignature() {
        return signature;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public LocationInfo getLocationInfo() {
        return location;
    }

    public void setLocationInfo(LocationInfo locationInfo) {
        this.location = locationInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntityInfo that = (EntityInfo) o;
        return container.equals(that.container) && type == that.type && name.equals(that.name) && Objects.equals(signature, that.signature) && Objects.equals(filePath, that.filePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(container, type, name, signature, filePath);
    }

    @Override
    public String toString() {
        return "EntityInfo{" +
                "container='" + container + '\'' +
                ", label=" + type +
                ", name='" + name + '\'' +
//                ", startLine=" + location.getStartLine() +
//                ", endLine=" + location.getEndLine() +
                '}';
    }
}
