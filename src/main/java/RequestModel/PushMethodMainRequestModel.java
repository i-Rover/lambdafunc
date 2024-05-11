package RequestModel;

import java.util.List;

public class PushMethodMainRequestModel {
    public RequestSTPHeaderModel header;
    public List<PushMethodRequestModel> response;

    public RequestSTPHeaderModel getHeader() {
        return header;
    }

    public void setHeader(RequestSTPHeaderModel header) {
        this.header = header;
    }

    public List<PushMethodRequestModel> getResponse() {
        return response;
    }

    public void setResponse(List<PushMethodRequestModel> response) {
        this.response = response;
    }
}
