package org.wyona.webapp.controllers.v2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.wyona.webapp.models.katie.Domain;
import org.wyona.webapp.models.katie.QnA;

public interface KatieConnectorController {

    /**
     * Create tenant
     * @param domain Domain object containing domain Id and name
     */
    public ResponseEntity<String> createTenant(@RequestBody Domain domain);

    /**
     * Delete tenant
     * @param domainId Domain Id
     */
    public ResponseEntity<?> deleteTenant(String domainId);

    /**
     * Add/train a particular question/answer associated with a particular domain
     * @param qna Question and answer
     */
    public ResponseEntity<?> train(QnA qna);
}
