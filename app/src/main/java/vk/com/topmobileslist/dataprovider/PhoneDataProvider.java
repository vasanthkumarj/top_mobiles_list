package vk.com.topmobileslist.dataprovider;

public class PhoneDataProvider {

    private int phoneImage;
    private String phoneName;
    private String phoneRating;

    public PhoneDataProvider(final int phoneImage, final String phoneName, final String phoneRating) {
        this.phoneImage = phoneImage;
        this.phoneName = phoneName;
        this.phoneRating = phoneRating;
    }

    public int getPhoneImage() {
        return phoneImage;
    }

    public void setPhoneImage(final int phoneImage) {
        this.phoneImage = phoneImage;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(final String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneRating() {
        return phoneRating;
    }

    public void setPhoneRating(final String phoneRating) {
        this.phoneRating = phoneRating;
    }
}
