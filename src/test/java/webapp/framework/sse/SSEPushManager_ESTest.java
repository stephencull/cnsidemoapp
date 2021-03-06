package webapp.framework.sse;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.LinkedList;
import java.util.List;
import org.junit.runner.RunWith;
import webapp.framework.sse.EventTarget;
import webapp.framework.sse.MessageEvent;
import webapp.framework.sse.SSEPushManager;

public class SSEPushManager_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      LinkedList<EventTarget> linkedList0 = new LinkedList<EventTarget>();
      sSEPushManager0.mEventTargetList = (List<EventTarget>) linkedList0;
      linkedList0.add((EventTarget) null);
      List<EventTarget> list0 = sSEPushManager0.getTargetList();
      assertFalse(list0.isEmpty());
  }


  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      LinkedList<EventTarget> linkedList0 = new LinkedList<EventTarget>();
      sSEPushManager0.mEventTargetList = (List<EventTarget>) linkedList0;
      linkedList0.add((EventTarget) null);
      sSEPushManager0.clearTargets();
  }


 
  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      List<EventTarget> list0 = sSEPushManager0.getTargetList();
      assertEquals(0, list0.size());
  }

 

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SSEPushManager sSEPushManager0 = new SSEPushManager();
      List<EventTarget> list0 = sSEPushManager0.broadcast("`y", "`y");
      assertEquals(0, list0.size());
  }
}
