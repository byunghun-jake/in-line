package com.inline.sub2.api.service;

import com.inline.sub2.api.dto.CommuteDto;
import com.inline.sub2.db.entity.CommuteEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CommuteService {
    @Transactional(rollbackFor = Exception.class)
    CommuteEntity commuteLogin(CommuteDto commuteDto);
    CommuteEntity commuteIn(Long commuteId);
    CommuteEntity commuteOut(Long commuteId);
    CommuteEntity commuteInfo(Long userId);
//    List<CommuteEntity> commuteList(Long officeId);
}
