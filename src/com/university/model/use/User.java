package com.university.model.use;

public class User implements IUser{

    private String userFirstName;
    private String userLastName;
    private int userId;
    private String userTitle;
    private IType useType;

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public IType getUseType() {
        return useType;
    }

    public void setUseType(IType useType) {
        this.useType = useType;
    }
}
