/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.service;

import aQute.bnd.annotation.ProviderType;

/**
 * Provides a wrapper for {@link PortletItemLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PortletItemLocalService
 * @generated
 */
@ProviderType
public class PortletItemLocalServiceWrapper implements PortletItemLocalService,
	ServiceWrapper<PortletItemLocalService> {
	public PortletItemLocalServiceWrapper(
		PortletItemLocalService portletItemLocalService) {
		_portletItemLocalService = portletItemLocalService;
	}

	/**
	* Adds the portlet item to the database. Also notifies the appropriate model listeners.
	*
	* @param portletItem the portlet item
	* @return the portlet item that was added
	*/
	@Override
	public com.liferay.portal.model.PortletItem addPortletItem(
		com.liferay.portal.model.PortletItem portletItem) {
		return _portletItemLocalService.addPortletItem(portletItem);
	}

	@Override
	public com.liferay.portal.model.PortletItem addPortletItem(long userId,
		long groupId, java.lang.String name, java.lang.String portletId,
		java.lang.String className)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _portletItemLocalService.addPortletItem(userId, groupId, name,
			portletId, className);
	}

	/**
	* Creates a new portlet item with the primary key. Does not add the portlet item to the database.
	*
	* @param portletItemId the primary key for the new portlet item
	* @return the new portlet item
	*/
	@Override
	public com.liferay.portal.model.PortletItem createPortletItem(
		long portletItemId) {
		return _portletItemLocalService.createPortletItem(portletItemId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _portletItemLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the portlet item from the database. Also notifies the appropriate model listeners.
	*
	* @param portletItem the portlet item
	* @return the portlet item that was removed
	*/
	@Override
	public com.liferay.portal.model.PortletItem deletePortletItem(
		com.liferay.portal.model.PortletItem portletItem) {
		return _portletItemLocalService.deletePortletItem(portletItem);
	}

	/**
	* Deletes the portlet item with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param portletItemId the primary key of the portlet item
	* @return the portlet item that was removed
	* @throws PortalException if a portlet item with the primary key could not be found
	*/
	@Override
	public com.liferay.portal.model.PortletItem deletePortletItem(
		long portletItemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _portletItemLocalService.deletePortletItem(portletItemId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _portletItemLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _portletItemLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.PortletItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _portletItemLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.PortletItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _portletItemLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _portletItemLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _portletItemLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.portal.model.PortletItem fetchPortletItem(
		long portletItemId) {
		return _portletItemLocalService.fetchPortletItem(portletItemId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _portletItemLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _portletItemLocalService.getBeanIdentifier();
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _portletItemLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public com.liferay.portal.model.PortletItem getPortletItem(long groupId,
		java.lang.String name, java.lang.String portletId,
		java.lang.String className)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _portletItemLocalService.getPortletItem(groupId, name,
			portletId, className);
	}

	/**
	* Returns the portlet item with the primary key.
	*
	* @param portletItemId the primary key of the portlet item
	* @return the portlet item
	* @throws PortalException if a portlet item with the primary key could not be found
	*/
	@Override
	public com.liferay.portal.model.PortletItem getPortletItem(
		long portletItemId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _portletItemLocalService.getPortletItem(portletItemId);
	}

	@Override
	public java.util.List<com.liferay.portal.model.PortletItem> getPortletItems(
		long groupId, java.lang.String className) {
		return _portletItemLocalService.getPortletItems(groupId, className);
	}

	@Override
	public java.util.List<com.liferay.portal.model.PortletItem> getPortletItems(
		long groupId, java.lang.String portletId, java.lang.String className) {
		return _portletItemLocalService.getPortletItems(groupId, portletId,
			className);
	}

	/**
	* Returns a range of all the portlet items.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.portal.model.impl.PortletItemModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of portlet items
	* @param end the upper bound of the range of portlet items (not inclusive)
	* @return the range of portlet items
	*/
	@Override
	public java.util.List<com.liferay.portal.model.PortletItem> getPortletItems(
		int start, int end) {
		return _portletItemLocalService.getPortletItems(start, end);
	}

	/**
	* Returns the number of portlet items.
	*
	* @return the number of portlet items
	*/
	@Override
	public int getPortletItemsCount() {
		return _portletItemLocalService.getPortletItemsCount();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_portletItemLocalService.setBeanIdentifier(beanIdentifier);
	}

	/**
	* Updates the portlet item in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param portletItem the portlet item
	* @return the portlet item that was updated
	*/
	@Override
	public com.liferay.portal.model.PortletItem updatePortletItem(
		com.liferay.portal.model.PortletItem portletItem) {
		return _portletItemLocalService.updatePortletItem(portletItem);
	}

	@Override
	public com.liferay.portal.model.PortletItem updatePortletItem(long userId,
		long groupId, java.lang.String name, java.lang.String portletId,
		java.lang.String className)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _portletItemLocalService.updatePortletItem(userId, groupId,
			name, portletId, className);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	@Deprecated
	public PortletItemLocalService getWrappedPortletItemLocalService() {
		return _portletItemLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	@Deprecated
	public void setWrappedPortletItemLocalService(
		PortletItemLocalService portletItemLocalService) {
		_portletItemLocalService = portletItemLocalService;
	}

	@Override
	public PortletItemLocalService getWrappedService() {
		return _portletItemLocalService;
	}

	@Override
	public void setWrappedService(
		PortletItemLocalService portletItemLocalService) {
		_portletItemLocalService = portletItemLocalService;
	}

	private PortletItemLocalService _portletItemLocalService;
}