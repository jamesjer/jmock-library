/*  Copyright (c) 2000-2004 jMock.org
 */
package org.jmock.core;


public interface InvocationMatcher
        extends Verifiable, SelfDescribing
{
    boolean matches( Invocation invocation );

    void invoked( Invocation invocation );

    boolean hasDescription();
}
