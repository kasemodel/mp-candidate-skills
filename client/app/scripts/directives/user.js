;(function() {
	'use strict';

	angular.module('clientApp')
	  .directive('user', user);

	function user() {
	    return {
			templateUrl: '../views/user.html',
			restrict: 'E',
			link: function postLink(scope, element, attrs) {
				//element.text('this is the user directive');
			}
	    }
	}
})();
