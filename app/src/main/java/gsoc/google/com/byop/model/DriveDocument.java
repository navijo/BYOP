package gsoc.google.com.byop.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by lgwork on 24/05/16.
 */
public class DriveDocument implements Parcelable {
    private String driveId;
    private String title;
    private String description;
    private String extension;
    private String resourceId;
    private String link;


    public DriveDocument() {
        this.driveId = "";
        this.title = "";
        this.extension = "";
        this.resourceId = "";
        this.description = "";
        this.link = "";
    }


    public DriveDocument(String driveId, String title, String extension, String resourceId, String description) {
        this.driveId = driveId;
        this.title = title;
        this.extension = extension;
        this.resourceId = resourceId;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getDriveId() {
        return driveId;
    }

    public void setDriveId(String driveId) {
        this.driveId = driveId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DriveDocument docu = (DriveDocument) o;

        return docu.getDriveId().equals(this.driveId);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (driveId != null ? driveId.hashCode() : 0);
        return result;
    }

    public static final Creator CREATOR =
            new Creator() {
                public DriveDocument createFromParcel(Parcel in) {
                    return new DriveDocument(in);
                }

                public DriveDocument[] newArray(int size) {
                    return new DriveDocument[size];
                }
            };


    public DriveDocument(Parcel in) {
        driveId = in.readString();
        title = in.readString();
        extension = in.readString();
        resourceId = in.readString();
        description = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(driveId);
        dest.writeString(title);
        dest.writeString(extension);
        dest.writeString(resourceId);
        dest.writeString(description);
    }
}
