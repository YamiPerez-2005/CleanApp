package com.esfe.CleanApp.application.usecase;

import com.esfe.CleanApp.domain.port.in.CheckDbHealtUseCase;
import com.esfe.CleanApp.domain.port.out.SqlHealthPort;


public class CheckDbHealthService implements CheckDbHealtUseCase {
    private final SqlHealthPort sql;
    public CheckDbHealthService(SqlHealthPort sql){
        this.sql=sql;

    }
    @Override
    public boolean isHealthy()
    {
        try{
            return sql.ping();
        }
        catch (Exception e)
        {
            return false;
        }
    }
}
