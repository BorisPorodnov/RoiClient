package net.porodnov.service;

import net.porodnov.client.RoiClient;
import net.porodnov.model.PetitionListDataModel;
import net.porodnov.model.PetitionModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestRoiService implements RoiService {
    private static final Logger log = LoggerFactory.getLogger(RestRoiService.class);
    private final RoiClient roiClient;

    public RestRoiService(RoiClient roiClient) {
        this.roiClient = roiClient;
    }

    @Override
    public void processPoll() {
        PetitionListDataModel poll = roiClient.getPoll();
        List<PetitionModel> dataList = poll.getData();
        log.info("У нас {} инициатив на голосовании.", dataList.size());
    }

}
