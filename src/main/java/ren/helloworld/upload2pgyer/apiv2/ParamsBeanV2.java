package ren.helloworld.upload2pgyer.apiv2;

public class ParamsBeanV2 {
    private String apiKey;
    private String scandir;
    private String wildcard;
    private String uploadFile;
    private String buildInstallType;
    private String buildPassword;
    private String buildUpdateDescription;
    private String buildName;

    private String qrcodePath;
    private String envVarsPath;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getScandir() {
        return scandir;
    }

    public void setScandir(String scandir) {
        this.scandir = scandir;
    }

    public String getWildcard() {
        return wildcard;
    }

    public void setWildcard(String wildcard) {
        this.wildcard = wildcard;
    }

    public String getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(String uploadFile) {
        this.uploadFile = uploadFile;
    }

    public String getBuildInstallType() {
        return buildInstallType;
    }

    public void setBuildInstallType(String buildInstallType) {
        this.buildInstallType = buildInstallType;
    }

    public String getBuildPassword() {
        return buildPassword;
    }

    public void setBuildPassword(String buildPassword) {
        this.buildPassword = buildPassword;
    }

    public String getBuildName() {
        return buildName;
    }

    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    public String getBuildUpdateDescription() {
        return buildUpdateDescription;
    }

    public void setBuildUpdateDescription(String buildUpdateDescription) {
        this.buildUpdateDescription = buildUpdateDescription;
    }

    public String getQrcodePath() {
        return qrcodePath;
    }

    public void setQrcodePath(String qrcodePath) {
        this.qrcodePath = qrcodePath;
    }

    public String getEnvVarsPath() {
        return envVarsPath;
    }

    public void setEnvVarsPath(String envVarsPath) {
        this.envVarsPath = envVarsPath;
    }
}
