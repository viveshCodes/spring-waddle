public class Browser {

    public void navigate(String address) {

        String ip = findIp(address);
        String html = httpRequest(ip);
        System.out.println(html);
    }

    private String findIp(String address) {
        return "127.0.0.1";
    }

    private String httpRequest(String ip) {
        return "<html></html>";
    }
}
