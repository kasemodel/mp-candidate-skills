'use strict';

describe('Controller: KnowledgesCtrl', function () {

  // load the controller's module
  beforeEach(module('clientApp'));

  var KnowledgesCtrl,
    scope;

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope) {
    scope = $rootScope.$new();
    scope.user = {
      'name':'Jonas',
      'email':'jonas@gmail.com'
    };
    KnowledgesCtrl = $controller('KnowledgesCtrl', {
      $scope: scope
    });
  }));

  it('should knowledge is a added to the user', function () {
    expect(scope.user).toBeDefined();
  });
});
