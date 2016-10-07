import React, { Component, PropTypes } from 'react';
import { connect } from 'dva';
import { Link } from 'dva/router';

import SidePanel from './parts/SidePanel';
import Header from './parts/Header';
import Footer from './parts/Footer';

import 'antd/dist/antd.less';

import styles from './MainLayout.less';

function MainLayout({user, allowRegister, menuItems, children}) {
  return (
    <div className={styles.wrapper}>
    	<SidePanel menuItems={menuItems} />
    	<div className={styles.main}>
        	<Header user={user} allowRegister={allowRegister} />
         	{children}
          <Footer />
        </div>   
    </div>
  );
}

MainLayout.propTypes = {
  children: PropTypes.node.isRequired,
};

export default MainLayout;