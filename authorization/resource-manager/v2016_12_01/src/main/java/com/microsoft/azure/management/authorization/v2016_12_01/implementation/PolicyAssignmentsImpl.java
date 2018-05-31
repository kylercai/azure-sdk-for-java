/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.authorization.v2016_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.authorization.v2016_12_01.PolicyAssignments;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.authorization.v2016_12_01.PolicyAssignment;
import com.microsoft.azure.arm.utils.PagedListConverter;

class PolicyAssignmentsImpl extends WrapperImpl<PolicyAssignmentsInner> implements PolicyAssignments {
    private PagedListConverter<PolicyAssignmentInner, PolicyAssignment> converter;
    private final AuthorizationManager manager;

    PolicyAssignmentsImpl(AuthorizationManager manager) {
        super(manager.inner().policyAssignments());
        this.manager = manager;
        this.converter = new PagedListConverter<PolicyAssignmentInner, PolicyAssignment>() {
            @Override
            public Observable<PolicyAssignment> typeConvertAsync(PolicyAssignmentInner inner) {
                return Observable.just((PolicyAssignment) wrapModel(inner));
            }
        };
    }

    public AuthorizationManager manager() {
        return this.manager;
    }

    @Override
    public PolicyAssignmentImpl define(String name) {
        return wrapModel(name);
    }

    private PolicyAssignmentImpl wrapModel(PolicyAssignmentInner inner) {
        return  new PolicyAssignmentImpl(inner, manager());
    }

    private PolicyAssignmentImpl wrapModel(String name) {
        return new PolicyAssignmentImpl(name, this.manager());
    }

    @Override
    public Completable deleteAsync(String scope, String policyAssignmentName) {
        PolicyAssignmentsInner client = this.inner();
        return client.deleteAsync(scope, policyAssignmentName).toCompletable();
    }

    @Override
    public Observable<PolicyAssignment> getAsync(String scope, String policyAssignmentName) {
        PolicyAssignmentsInner client = this.inner();
        return client.getAsync(scope, policyAssignmentName)
        .map(new Func1<PolicyAssignmentInner, PolicyAssignment>() {
            @Override
            public PolicyAssignment call(PolicyAssignmentInner inner) {
                return new PolicyAssignmentImpl(inner, manager());
            }
        });
    }

    private Observable<Page<PolicyAssignmentInner>> listForResourceNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        PolicyAssignmentsInner client = this.inner();
        return client.listForResourceNextAsync(nextLink)
        .flatMap(new Func1<Page<PolicyAssignmentInner>, Observable<Page<PolicyAssignmentInner>>>() {
            @Override
            public Observable<Page<PolicyAssignmentInner>> call(Page<PolicyAssignmentInner> page) {
                return Observable.just(page).concatWith(listForResourceNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<PolicyAssignment> listForResourceAsync(final String resourceGroupName, final String resourceProviderNamespace, final String parentResourcePath, final String resourceType, final String resourceName) {
        PolicyAssignmentsInner client = this.inner();
        return client.listForResourceAsync(resourceGroupName, resourceProviderNamespace, parentResourcePath, resourceType, resourceName)
        .flatMap(new Func1<Page<PolicyAssignmentInner>, Observable<Page<PolicyAssignmentInner>>>() {
            @Override
            public Observable<Page<PolicyAssignmentInner>> call(Page<PolicyAssignmentInner> page) {
                return listForResourceNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<PolicyAssignmentInner>, Iterable<PolicyAssignmentInner>>() {
            @Override
            public Iterable<PolicyAssignmentInner> call(Page<PolicyAssignmentInner> page) {
                return page.items();
            }
       })
        .map(new Func1<PolicyAssignmentInner, PolicyAssignment>() {
            @Override
            public PolicyAssignment call(PolicyAssignmentInner inner) {
                return new PolicyAssignmentImpl(inner, manager());
            }
       });
    }

    @Override
    public Completable deleteByIdAsync(String policyAssignmentId) {
        PolicyAssignmentsInner client = this.inner();
        return client.deleteByIdAsync(policyAssignmentId).toCompletable();
    }

    @Override
    public Observable<PolicyAssignment> createByIdAsync(String policyAssignmentId, PolicyAssignmentInner parameters) {
        PolicyAssignmentsInner client = this.inner();
        return client.createByIdAsync(policyAssignmentId, parameters)
        .map(new Func1<PolicyAssignmentInner, PolicyAssignment>() {
            @Override
            public PolicyAssignment call(PolicyAssignmentInner inner) {
                return new PolicyAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyAssignment> getByIdAsync(String policyAssignmentId) {
        PolicyAssignmentsInner client = this.inner();
        return client.getByIdAsync(policyAssignmentId)
        .map(new Func1<PolicyAssignmentInner, PolicyAssignment>() {
            @Override
            public PolicyAssignment call(PolicyAssignmentInner inner) {
                return new PolicyAssignmentImpl(inner, manager());
            }
        });
    }

    @Override
    public PagedList<PolicyAssignment> list() {
        PolicyAssignmentsInner client = this.inner();
        return converter.convert(client.list());
    }

    private Observable<Page<PolicyAssignmentInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        PolicyAssignmentsInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<PolicyAssignmentInner>, Observable<Page<PolicyAssignmentInner>>>() {
            @Override
            public Observable<Page<PolicyAssignmentInner>> call(Page<PolicyAssignmentInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<PolicyAssignment> listAsync() {
        PolicyAssignmentsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<PolicyAssignmentInner>, Observable<Page<PolicyAssignmentInner>>>() {
            @Override
            public Observable<Page<PolicyAssignmentInner>> call(Page<PolicyAssignmentInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<PolicyAssignmentInner>, Iterable<PolicyAssignmentInner>>() {
            @Override
            public Iterable<PolicyAssignmentInner> call(Page<PolicyAssignmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyAssignmentInner, PolicyAssignment>() {
            @Override
            public PolicyAssignment call(PolicyAssignmentInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<PolicyAssignment> listByResourceGroup(String resourceGroupName) {
        PolicyAssignmentsInner client = this.inner();
        return converter.convert(client.listByResourceGroup(resourceGroupName));
    }

    private Observable<Page<PolicyAssignmentInner>> listByResourceGroupNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        PolicyAssignmentsInner client = this.inner();
        return client.listByResourceGroupNextAsync(nextLink)
        .flatMap(new Func1<Page<PolicyAssignmentInner>, Observable<Page<PolicyAssignmentInner>>>() {
            @Override
            public Observable<Page<PolicyAssignmentInner>> call(Page<PolicyAssignmentInner> page) {
                return Observable.just(page).concatWith(listByResourceGroupNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<PolicyAssignment> listByResourceGroupAsync(String resourceGroupName) {
        PolicyAssignmentsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<PolicyAssignmentInner>, Observable<Page<PolicyAssignmentInner>>>() {
            @Override
            public Observable<Page<PolicyAssignmentInner>> call(Page<PolicyAssignmentInner> page) {
                return listByResourceGroupNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<PolicyAssignmentInner>, Iterable<PolicyAssignmentInner>>() {
            @Override
            public Iterable<PolicyAssignmentInner> call(Page<PolicyAssignmentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyAssignmentInner, PolicyAssignment>() {
            @Override
            public PolicyAssignment call(PolicyAssignmentInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
