package com.orbit.services.transactions;

import com.orbit.dto.request.TransactionRequest;
import com.orbit.dto.response.ServiceResponse;

public interface TransactionService {
    ServiceResponse withdraw(TransactionRequest withdrawalRequest);
    ServiceResponse deposit(TransactionRequest depositRequest);
}
