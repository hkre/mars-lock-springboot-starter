package io.github.mars.lock.service;


import io.github.mars.lock.exception.OnLockException;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

/**
 * 默认上锁失败业务接口实现层
 *
 * @author lihao3
 */
@Service
public class DefaultLockFailedServiceImpl implements OnLockFailedService {

  @Override
  public void onLockFailed(Method method, Object[] arguments) {
    throw new OnLockException("On Lock Failed!");
  }
}
