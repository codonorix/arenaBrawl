package me.logan.arenabrawl.permissions;

public enum AdminPermissions {
    ADMIN_KEYS("arenabrawl.admin.magickeys"),
    ;

    private final String value;

    AdminPermissions(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
