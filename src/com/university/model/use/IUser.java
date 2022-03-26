package com.university.model.use;

public interface IUser {
    String getUserFirstName();
    void setUserFirstName(String userFirstName);
    String getUserLastName();
    void setUserLastName(String userLastName);
    int getUserId();
    void setUserId(int userId);
    String getUserTitle();
    void setUserTitle(String userTitle);
    IType getUseType();
    void setUseType(IType useType);
}
